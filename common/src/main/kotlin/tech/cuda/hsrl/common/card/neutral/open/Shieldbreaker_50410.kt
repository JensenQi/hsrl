package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shieldbreaker_50410 : Card() {
    override val id = 50410
    override val name = "破盾者"
    override val description = "<b>战吼：</b><b>沉默</b>一个具有<b>嘲讽</b>的敌方随从。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "经营范围还包括：停止纷争，破坏关系，干扰结盟。"
    override val artist = "David Devries"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ce5198d1b4048b7e538a8df4548b12209c664431a4638209a9c891c9f03a6cd2.png"
}
