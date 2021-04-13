package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarsongOutrider_66863 : Card() {
    override val id = 66863
    override val name = "战歌侦察骑兵"
    override val description = "<b>突袭</b>"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "战歌氏族的侦察骑兵不是外人，都是氏族成员的内人。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc2ddc92c575d341cceef29c58efe6f84400f92d809c4d732b918756dcd03151.png"
}
