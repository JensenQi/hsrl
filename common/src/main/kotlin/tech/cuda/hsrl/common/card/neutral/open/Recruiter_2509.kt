package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Recruiter_2509 : Card() {
    override val id = 2509
    override val name = "征募官"
    override val description = "<b>激励：</b>将一个2/2的侍从置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "我才不会告诉你我的这位侍从是在白银之手骑士那里挖过来的呢！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4265b94131f6b3ba7ce60839724f6583a7dd9d5155e100697f47903f7e4d9b00.png"
}
