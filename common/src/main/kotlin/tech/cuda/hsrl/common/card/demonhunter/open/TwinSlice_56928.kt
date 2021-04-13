package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwinSlice_56928 : Card() {
    override val id = 56928
    override val name = "双刃斩击"
    override val description = "在本回合中，使你的英雄获得+2攻击力。将“二次斩击”置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "砍得好，砍得妙，两刀把你们全放倒。"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e35c29daf26b00e616dfea926e37a9fc5bb13be4a34e16daa2f174edda9bfad4.png"
}
