package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZzerakuTheWarped_54897 : Card() {
    override val id = 54897
    override val name = "扭曲巨龙泽拉库"
    override val description = "每当你的英雄受到伤害，召唤一条6/6的虚空幼龙。"
    override var cost: Int? = 8
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "和泽拉图没有任何关系。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c4c76379dd2dc292fecad8fe002c0a6343cd34cbab92499f87851ddb41b2d2aa.png"
}
