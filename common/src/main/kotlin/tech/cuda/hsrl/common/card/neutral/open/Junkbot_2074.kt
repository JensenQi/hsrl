package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Junkbot_2074 : Card() {
    override val id = 2074
    override val name = "回收机器人"
    override val description = "每当一个友方机械死亡，便获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "当某个零部件对某个机器人不再有用时，它可能会使另一个机器人焕然一新。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a42f56057b88e55216143eba564a752eec69aa77994f15c0357ff4c8d670a50.png"
}
