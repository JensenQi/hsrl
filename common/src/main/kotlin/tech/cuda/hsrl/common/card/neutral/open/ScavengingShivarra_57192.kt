package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScavengingShivarra_57192 : Card() {
    override val id = 57192
    override val name = "食腐破坏魔"
    override val description = "<b>战吼：</b>造成6点伤害，随机分配到所有其他随从身上。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "说说你的需求吧，不过先说好，想找到一套六把的武器还是有难度的。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/96e2daf9c00b5b1a7c8601adc4069118efac1bcf824c21d56e60c357bbd712a4.png"
}
