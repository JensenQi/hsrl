package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Volcanosaur_41120 : Card() {
    override val id = 41120
    override val name = "火山龙"
    override val description = "<b>战吼：</b> 连续<b>进化</b>两次。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "当溃疡长在背上时，你的脾气也不会好到哪去。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c22ae703f1af100604f1975d5c6072eb7091fb4b5e208b4f8e02c36425281441.png"
}
