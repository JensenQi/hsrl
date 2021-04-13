package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FirstDayOfSchool_59038 : Card() {
    override val id = 59038
    override val name = "新生入学"
    override val description = "随机将两张法力值消耗为（1）的随从牌置入你的手牌。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“教材请到书店购买。药剂请在炼金师处购买。魔杖的购买地点是……制杖室？”"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c2fe13ca690840e0ea3abc55ba0026b72fa67a4a6c56bdee5c14c770c6ac9415.png"
}
