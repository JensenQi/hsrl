package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FacelessRager_52936 : Card() {
    override val id = 52936
    override val name = "无面暴怒者"
    override val description = "<b>战吼：</b>复制一个友方随从的生命值。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "为了匿名发飙，连脸都不要了。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/627d4105c9c56d7e9a8294281d70db9173e500e3f23b70010f2a828e5d70da99.png"
}
