package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoltenBlast_59214 : Card() {
    override val id = 59214
    override val name = "岩浆爆裂"
    override val description = "造成 2点伤害，召唤相同数量的1/1的元素。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "那么，考试周结束后，<b>你</b>想怎么庆祝？！"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f56ee660e262fa185352a6247812351efc8a1edb8215b8e9cbf5997777641da.png"
}
