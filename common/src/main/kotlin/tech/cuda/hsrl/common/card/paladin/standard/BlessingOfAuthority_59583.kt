package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfAuthority_59583 : Card() {
    override val id = 59583
    override val name = "威能祝福"
    override val description = "使一个随从获得+8/+8，在本回合中无法攻击英雄。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "心怀荣耀的圣骑士在战斗中从不屑于打脸……直到下个回合！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ed57772663e713e545250c69760d08ce43b2daf2507f1c2c2165919ef23f858.png"
}
