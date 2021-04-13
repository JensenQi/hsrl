package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KookyChemist_40289 : Card() {
    override val id = 40289
    override val name = "化学怪人"
    override val description = "<b>战吼：</b> 使一个随从的攻击力和生命值互换。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "放心吧，不会爆炸的…炸也死不了人。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6d844258ee69dcaa7dbc7266a8a14733b618ef0fdbaad7ee0966c82caa1fae36.png"
}
