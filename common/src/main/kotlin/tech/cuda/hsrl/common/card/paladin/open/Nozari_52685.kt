package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nozari_52685 : Card() {
    override val id = 52685
    override val name = "诺萨莉"
    override val description = "<b>战吼：</b>为双方英雄恢复所有生命值。"
    override var cost: Int? = 10
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "在另一条时间线上，她能把两个英雄都弄死。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b53037d13ed772682ee3880ba5b1fd7cecf0b89709bb4fabacd938b0905ba76e.png"
}
