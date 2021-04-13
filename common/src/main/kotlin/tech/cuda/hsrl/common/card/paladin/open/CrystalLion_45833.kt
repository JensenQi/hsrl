package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrystalLion_45833 : Card() {
    override val id = 45833
    override val name = "水晶雄狮"
    override val description = "<b>圣盾</b> 你每控制一个白银之手新兵，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "新兵的标准装备：一把白银之剑，一面洛丹伦徽记盾牌，还有两袋水晶猫粮。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2dab56309a7cff254d2e5703de83fda833f302d7ddb81386cb42e6b5881ebd62.png"
}
