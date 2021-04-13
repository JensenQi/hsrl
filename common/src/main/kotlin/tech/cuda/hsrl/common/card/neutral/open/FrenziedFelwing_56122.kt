package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrenziedFelwing_56122 : Card() {
    override val id = 56122
    override val name = "狂暴邪翼蝠"
    override val description = "在本回合中，你的对手每受到1点伤害，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "白骨怨灵生前的原型找到了！"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e410820121df4ce5d285c05d2e86f3e1f7adf0b822f3e10d5ec892488cb7d08.png"
}
