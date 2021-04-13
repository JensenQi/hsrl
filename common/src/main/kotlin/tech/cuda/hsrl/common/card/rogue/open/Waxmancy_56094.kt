package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Waxmancy_56094 : Card() {
    override val id = 56094
    override val name = "蜡烛学"
    override val description = "<b>发现</b>一张<b>战吼</b>随从牌。其法力值消耗减少（2）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "精烧细作两手间， 火蜡交织塑浑圆。 旁人不解说疯子， 只因随从省蜡钱。"
    override val artist = "Lloyd Hoshide"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6dbe41127ed96953686634e8ebc68874bdfaebb8ed31cfa18efb9a25a7d6f252.png"
}
