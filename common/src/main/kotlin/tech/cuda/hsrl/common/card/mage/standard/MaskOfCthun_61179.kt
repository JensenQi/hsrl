package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MaskOfCthun_61179 : Card() {
    override val id = 61179
    override val name = "克苏恩面具"
    override val description = "造成 10点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "戴上面具，与之共生；巨眼闪烁，真相纷呈。"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d7e31398d06105e26224b6cb579f7785b94201119f5f278e07cbccbb102137b.png"
}
