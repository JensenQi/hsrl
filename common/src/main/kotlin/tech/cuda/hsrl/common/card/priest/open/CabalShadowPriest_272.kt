package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CabalShadowPriest_272 : Card() {
    override val id = 272
    override val name = "秘教暗影祭司"
    override val description = "<b>战吼：</b>获得一个攻击力小于或等于2的敌方随从的控制权。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "你绝不知道谁在为这个秘密组织效劳..."
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/171e98fa1e1497220d52efd0ee189f890db016664a5bf8fcf77a5684f6ec9552.png"
}
