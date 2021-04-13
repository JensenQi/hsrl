package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CheapShot_46897 : Card() {
    override val id = 46897
    override val name = "偷袭"
    override val description = "<b>回响</b> 对一个随从造成 2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "虽然有些卑鄙，但造成的伤害可不打折！"
    override val artist = "Rock Niu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b046add6c066ddfce649b4be7a22032ff5596b1f562aa889d6538c75cb393e9.png"
}
