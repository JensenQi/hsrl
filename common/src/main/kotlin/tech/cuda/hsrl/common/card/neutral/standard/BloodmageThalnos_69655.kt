package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodmageThalnos_69655 : Card() {
    override val id = 69655
    override val name = "血法师萨尔诺斯"
    override val description = "<b>法术伤害+1</b>，<b>亡语：</b>抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "他负责每年一度的血色修道院献血运动！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69eea7b140dab262df18b6ec1a82764490bf2182979e01e9bc40c0b30b695692.png"
}
