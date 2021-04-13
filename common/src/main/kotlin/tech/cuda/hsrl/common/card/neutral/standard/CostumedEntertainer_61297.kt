package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CostumedEntertainer_61297 : Card() {
    override val id = 61297
    override val name = "盛装演员"
    override val description = "<b>战吼：</b>随机使你手牌中的一张随从牌获得+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "记住别说话，说话就出戏了。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de590f3e1b924ad4d5bb9c5710105c323ca56d03f3911131c558ff5ad8bbac5b.png"
}
