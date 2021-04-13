package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MidnightDrake_38957 : Card() {
    override val id = 38957
    override val name = "午夜噩龙"
    override val description = "<b>战吼：</b>你每有一张其他手牌，便获得+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "白天看上去也很恐怖。"
    override val artist = "Todd Lockwood"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69341922b4696e4168acc42e5329c587f8e91cc3c786ea91c1d5384d8f9d7aaa.png"
}
