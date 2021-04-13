package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuildRecruiter_46069 : Card() {
    override val id = 46069
    override val name = "公会招募员"
    override val description = "<b>战吼：</b><b>招募</b>一个法力值消耗小于或等于（4）点的随从。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "她以前是个电话销售员。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f63c81cd70c4d4bb9b1200c18004cd528372f399d8450e8507b3ffd1d1eaf7dc.png"
}
