package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneKeysmith_46654 : Card() {
    override val id = 46654
    override val name = "奥术锁匠"
    override val description = "<b>战吼：</b> <b>发现</b>一张<b>奥秘</b>牌，并将其置入战场。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "没有做不出的钥匙，只有打不开的心房。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa00c671a85277cd479a0a06f4b4a417eae9bedd8482bcbc9985ef7f380ed084.png"
}
