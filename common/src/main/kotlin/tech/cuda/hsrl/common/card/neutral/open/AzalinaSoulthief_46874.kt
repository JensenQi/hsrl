package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AzalinaSoulthief_46874 : Card() {
    override val id = 46874
    override val name = "窃魂者阿扎莉娜"
    override val description = "<b>战吼：</b>将你的手牌替换成对手手牌的 复制。"
    override var cost: Int? = 7
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "人家的卡总是金的。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c19cd8df3035fe8a3b61d36d030ee10f18ad2791edad1923a3348e4006cb9b28.png"
}
