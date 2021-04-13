package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DunkTank_61223 : Card() {
    override val id = 61223
    override val name = "深水炸弹"
    override val description = "造成 4点伤害。<b>腐蚀：</b>再对所有敌方随从造成 2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "腐蚀，其实就是拉你下水。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/688d1e48127c6fe5daafe7ce6e84b5881bb8f2c0a5891b2fcb7b30f7f545398e.png"
}
