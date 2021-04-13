package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserPearlSpellstone_43382 : Card() {
    override val id = 43382
    override val name = "小型法术珍珠"
    override val description = "召唤一个2/2并具有<b>嘲讽</b>的灵魂。 <i>（恢复3点生命值后升级。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“古神陨落的时代，军团的阿扎里制造了这些力量之石，用它们来诱惑凡人。弱者屈从于魔石的力量，他们的灵魂随即被吞噬。”——《魔石》"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8db118dc1f666ea5206df2f6c07f9d38306845d34a6466dee80a8f400c535d5c.png"
}
