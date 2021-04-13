package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AngryChicken_1688 : Card() {
    override val id = 1688
    override val name = "愤怒的小鸡"
    override val description = "受伤时具有+5攻 击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "没有什么野兽比一只彻底发疯的小鸡更加吓人（或者更加可笑）的了。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f92c71041a5b0b9d7bb32a5c3345f4d77d440af8a624faddaa73306f16fe001.png"
}
