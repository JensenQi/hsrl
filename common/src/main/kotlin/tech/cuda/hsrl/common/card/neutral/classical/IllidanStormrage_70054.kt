package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IllidanStormrage_70054 : Card() {
    override val id = 70054
    override val name = "伊利丹·怒风"
    override val description = "每当你使用一张牌时，召唤一个2/1的埃辛诺斯之焰。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "伊利丹的哥哥玛法里奥把他关在海加尔山下长达一万年。怒风两兄弟真是不明白“家和万事兴”的道理。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b9aa02d7f160ab2f887b60575fed5a4a13b441668e7f3192b594c165f97c4af0.png"
}
