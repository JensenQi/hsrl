package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FreeAdmission_61205 : Card() {
    override val id = 61205
    override val name = "免票入场"
    override val description = "抽两张随从牌。如果两张都是恶魔牌，使其法力值消耗减少（2）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“快点，别让别人看见你；至少别让他们看见我。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e8891e4be17ba0a5d65360a8d38bcbb5e60ee6f6551489f9a2b663d558baf634.png"
}
