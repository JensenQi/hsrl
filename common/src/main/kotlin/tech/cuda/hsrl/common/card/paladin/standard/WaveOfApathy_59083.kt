package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WaveOfApathy_59083 : Card() {
    override val id = 59083
    override val name = "倦怠光波"
    override val description = "直到你的下个回合，将所有敌方随从的攻击力变为1点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“卡牌趣文？唉。不想写了，累了。”"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cede7796f48d0105ff468a2cca4c0dc016e08b73d814417d9b1ca45215cbbd0e.png"
}
