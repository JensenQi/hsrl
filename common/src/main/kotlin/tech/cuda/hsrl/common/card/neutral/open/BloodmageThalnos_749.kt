package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodmageThalnos_749 : Card() {
    override val id = 749
    override val name = "血法师萨尔诺斯"
    override val description = "<b>法术伤害+1</b>，<b>亡语：</b>抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他负责每年一度的血色修道院献血运动！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/033bd62f011cce0341390d112ec95ff70c0325c97d2c3f628b82afe43a5598c9.png"
}
