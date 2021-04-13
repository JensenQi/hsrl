package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KrulTheUnshackled_40537 : Card() {
    override val id = 40537
    override val name = "唤魔者克鲁尔"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则召唤你手牌中的所有 恶魔。"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "“只有能驾驭恶魔的人，才有资格成为一个术士”。斯匹克·菲兹把这段话刻在了自己的项链上。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7efe5331f58458989698c17801f44d128cde259cbf6b9c419c6aa2479bf3821a.png"
}
