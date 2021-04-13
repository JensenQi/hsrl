package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChargedHammer_2617 : Card() {
    override val id = 2617
    override val name = "灌魔之锤"
    override val description = "<b>亡语：</b>你的英雄技能改为“造成 2点伤害”。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "只有得到锤子认可的人，才能将其举起。"
    override val artist = "Peet Cooper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4ae51924d55bf2897bb832de4fc3d81ee3a0969dff90adf5489c6ffd1f620d4.png"
}
