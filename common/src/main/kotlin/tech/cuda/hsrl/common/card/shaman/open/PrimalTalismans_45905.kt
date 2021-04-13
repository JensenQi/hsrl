package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimalTalismans_45905 : Card() {
    override val id = 45905
    override val name = "原始护身符"
    override val description = "使你的所有随从获得 “<b>亡语：</b>随机召唤一个基础图腾。”"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "一位法师学徒练习烈焰风暴时烧毁了一个狗头人定居点，只留下了这个护身符，还有一地各种形状的木头柱子。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e0627c435e892a3fc49d3fdfb4bf75152fbe56adc8abdfea48000722fe77fce.png"
}
