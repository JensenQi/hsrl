package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmeraldReaver_41309 : Card() {
    override val id = 41309
    override val name = "翡翠掠夺者"
    override val description = "<b>战吼：</b>对每个英雄造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "他想去加基森干一番事业，玉莲帮会是不错的选择。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e1f428335bcdc26866fa563503835bc3c4bfd9dedacedef52ed1ecf7c8b1a2ad.png"
}
