package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wyrmguard_46988 : Card() {
    override val id = 46988
    override val name = "龙骨卫士"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便获得+1攻击力和<b>嘲讽</b>。"
    override var cost: Int? = 7
    override var health: Int? = 11
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "他们以为自己是无比荣耀的守护者，而龙只不过把他们当成饭后点心。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0465c95cabf144ce83663403272a9f44e73ed68ffc576e85f2a716379989c1cb.png"
}
