package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelsoulJailer_62350 : Card() {
    override val id = 62350
    override val name = "邪魂狱卒"
    override val description = "<b>战吼：</b>使你的对手弃掉一张随从牌。<b>亡语：</b>移回弃掉的牌。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "可以锁住，难以留住。"
    override val artist = "Juyoung Oh"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dee31380faeb22a37a3b1c35eb7af304aa45cc3e1cba2baf5cd6f61467395ba4.png"
}
