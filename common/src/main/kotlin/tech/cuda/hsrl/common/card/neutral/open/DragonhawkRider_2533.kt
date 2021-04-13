package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonhawkRider_2533 : Card() {
    override val id = 2533
    override val name = "龙鹰骑士"
    override val description = "<b>激励：</b>在本回合中，获得<b>风怒</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "瞧啊，骑着龙鹰也能做侧滚翻。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/697c2fbc9f71c84d86db4fe779ea0b7515d3dcfe5fb4c37ef4c87632b6a41f13.png"
}
