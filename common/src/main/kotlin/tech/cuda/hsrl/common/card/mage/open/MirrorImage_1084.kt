package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MirrorImage_1084 : Card() {
    override val id = 1084
    override val name = "镜像"
    override val description = "召唤两个0/2，并具有<b>嘲讽</b>的随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "哦，嘿，这是个镜像！！像镜个是这，嘿，哦"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80fe30e2a6653045ff6ffa7de3b7f30bb7e28b7bd02a7c853ba472990f122b2c.png"
}
