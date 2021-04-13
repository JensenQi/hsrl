package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OasisAlly_63553 : Card() {
    override val id = 63553
    override val name = "绿洲盟军"
    override val description = "<b>奥秘：</b> 当一个友方随从受到攻击时，召唤一个3/6的水元素。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "不错的，像母亲的手，抚摸着你。"
    override val artist = "Anzka Nguyen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e19228922bf0726c4909bf2923fe678b54f27e42063dd26af1479fffcddce7f.png"
}
