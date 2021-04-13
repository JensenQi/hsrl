package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Buccaneer_2715 : Card() {
    override val id = 2715
    override val name = "锈水海盗"
    override val description = "每当你装备一把武器，使武器获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "当海盗最棒的一点就是可以穿灯笼裤。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/146bee8de500544c2dc3076588e6f8a6eee02eab315318cbf2f4edc6007abe02.png"
}
