package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EaterOfSecrets_38792 : Card() {
    override val id = 38792
    override val name = "奥秘吞噬者"
    override val description = "<b>战吼：</b>摧毁所有敌方<b>奥秘</b>。每摧毁一个，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "要是他吃下了爆炸陷阱，就最好离他远一点。没人会喜欢这种惊喜的。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c87e47719a22a13153bd9170e0ad2c13cadb4715b31b71d6087b0060a45ed36c.png"
}
