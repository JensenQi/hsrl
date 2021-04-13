package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SouthseaSquidface_38825 : Card() {
    override val id = 38825
    override val name = "南海畸变船长"
    override val description = "<b>亡语：</b>使你的武器获得+2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "你有两个选择：要么死，要么在她的船上服役100年。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/06f060498fb00c39868f2b3a279c480ad75a279a41b660719d7f25ba4ccf5142.png"
}
