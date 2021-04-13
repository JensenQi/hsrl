package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PettingZoo_61700 : Card() {
    override val id = 61700
    override val name = "宠物乐园"
    override val description = "召唤一只3/3的陆行鸟。你每控制一个<b>奥秘</b>，重复一次。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "欢迎来到宠物乐园。严禁接触动物！"
    override val artist = "E. Li & A. Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3a69424e5cdb95bd881f21028e8814b937594ea842cf32e8c770bec2f802484.png"
}
