package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mecharoo_48886 : Card() {
    override val id = 48886
    override val name = "机械袋鼠"
    override val description = "<b>亡语：</b>召唤一个1/1的机械袋鼠宝宝。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她的宝宝有两个亲密玩伴，一个是机械小熊，一个是机械小虎。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2de46dfc6a949a9868f62ab3b0fcc07d212b3418bf31a2e8317f28e70f7d351a.png"
}
