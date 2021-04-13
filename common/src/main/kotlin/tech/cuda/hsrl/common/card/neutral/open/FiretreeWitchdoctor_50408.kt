package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FiretreeWitchdoctor_50408 : Card() {
    override val id = 50408
    override val name = "火树巫医"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便<b>发现</b> 一张法术牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "树着火了怎么办——捂一捂就好了。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd092f294754c38c64632b283881d9180405dfdf1d9075e284ddeb66e7e997df.png"
}
