package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MessengerRaven_51943 : Card() {
    override val id = 51943
    override val name = "渡鸦信使"
    override val description = "<b>战吼：</b><b>发现</b>一张法师随从牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "支持到付！"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d9ced5a14ebbad92f44facb668533a31edebec1c6b41eb6c9a96509d072d78c.png"
}
