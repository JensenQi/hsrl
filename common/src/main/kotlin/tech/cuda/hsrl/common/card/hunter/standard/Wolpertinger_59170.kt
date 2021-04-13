package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Wolpertinger_59170 : Card() {
    override val id = 59170
    override val name = "鹿角小飞兔"
    override val description = "<b>战吼：</b>召唤一个该随从的复制。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "学园的学生在美酒节玩得实在是太过分了。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/419a787ed490f2874cd454da12409e5c7e2df522b60559aff3391764075a1110.png"
}
