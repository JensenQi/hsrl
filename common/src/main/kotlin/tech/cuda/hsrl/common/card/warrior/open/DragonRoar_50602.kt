package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonRoar_50602 : Card() {
    override val id = 50602
    override val name = "巨龙怒吼"
    override val description = "随机将两张龙牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "听起来就像是巨龙在练习约德尔唱法。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83630237c21bf529db0c206ed395f55b045cde34e46b852dba30e4fe6a86daaf.png"
}
