package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FuriousFelfin_58495 : Card() {
    override val id = 58495
    override val name = "暴怒的邪鳍"
    override val description = "<b>战吼：</b>在本回合中，如果你的英雄进行过攻击，则获得+1攻击力和<b>突袭</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "招牌绝技包括眼鲮，鳞魂盛宴，还有鳄魔变形。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/25b9bb25411a867568412cfc329503a050ba8c5f883f90dfde97e847c15845cf.png"
}
