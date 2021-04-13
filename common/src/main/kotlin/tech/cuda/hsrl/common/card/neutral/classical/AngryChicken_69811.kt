package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AngryChicken_69811 : Card() {
    override val id = 69811
    override val name = "愤怒的小鸡"
    override val description = "<b>激怒：</b>+5攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "没有什么野兽比一只彻底发疯的小鸡更加吓人（或者更加可笑）的了。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9372132d54b203a20fe191af65f85ba4cfa31126fc953b1d99b8cf0f5f6a11fe.png"
}
