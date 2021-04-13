package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkulkingGeist_42784 : Card() {
    override val id = 42784
    override val name = "游荡恶鬼"
    override val description = "<b>战吼：</b>摧毁双方手牌中和牌库中所有法力值消耗为（1）的 法术牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "就好像千百万个青玉护符同时在咆哮，然后突然一切都变得鸦雀无声。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19ab07c50a0eda8ac20f94cfc7eeae3055f0a1de6eb70365ef9ad3cd100545fd.png"
}
