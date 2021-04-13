package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Landslide_61961 : Card() {
    override val id = 61961
    override val name = "大地崩陷"
    override val description = "对所有敌方随从造成 1点伤害。如果你有<b>过载</b>的法力水晶，再次造成 1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“好一场天塌地陷的大胜！咦，其他选手去哪儿了？”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ffa75106625a9352c3563758befa3c88237ce8e54450145f27eb786b05ebeddc.png"
}
